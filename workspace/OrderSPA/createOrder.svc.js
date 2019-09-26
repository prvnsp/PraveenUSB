var module = angular.module('myapp');

module.factory('CreateOrderSvc', function ($http) {

    var serviceResponse = {};
    serviceResponse.getResponse = function ($scope,cb) {
        
        $http({
            url: 'http://localhost:8095/orderinventory/addorder',
            method: 'POST',
            data: $.param({
                id : $scope.id,
				productName : $scope.pname,
                price : $scope.family,
                status : $scope.status
            }),
            headers: { 'Content-Type': 'application/json' }
        }).then(function (resp) {
            cb(resp.data);
        }, function (resp) {

        });
    }
    return serviceResponse;
});