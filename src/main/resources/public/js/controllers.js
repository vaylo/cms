angular.module('app.controllers', []).controller('ContractListController', function($scope, $state, popupService, $window, Contract) {

    $scope.contracts = Contract.query(); //fetch all contracts. Issues a GET to /api/vi/contracts

    $scope.deleteContract = function(contract) { // Delete a Contract. Issues a DELETE to /api/v1/contracts/:id
      if (popupService.showPopup('Really delete this?')) {
        contract.$delete(function() {
          $scope.contracts = Contract.query();
          $state.go('contracts');
        });
      }
    };
}).controller('ContractViewController', function($scope, $stateParams, Contract) {
    $scope.contract = Contract.get({ id: $stateParams.id }); //Get a single contract.Issues a GET to /api/v1/contracts/:id
}).controller('ContractCreateController', function($scope, $state, $stateParams, Contract) {
    $scope.contract = new Contract();  //create new contract instance. Properties will be set via ng-model on UI

    $scope.addContract = function() { //create a new contract. Issues a POST to /api/v1/contracts
      $scope.contract.$save(function() {
        $state.go('contracts'); // on success go back to the list i.e. contracts state.
      });
    };
}).controller('ContractEditController', function($scope, $state, $stateParams, Contract) {
    $scope.updateContract = function() { //Update the edited contract. Issues a PUT to /api/v1/contracts/:id
      $scope.contract.$update(function() {
        $state.go('contracts'); // on success go back to the list i.e. contracts state.
    });
};

$scope.loadContract = function() { //Issues a GET request to /api/v1/contracts/:id to get a contract to update
  $scope.contract = Contract.get({ id: $stateParams.id });
};

$scope.loadContract(); // Load a contract which can be edited on UI

});
