angular.module('app.services', []).factory('Contract', function($resource) {
  return $resource('/api/v1/contracts/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
