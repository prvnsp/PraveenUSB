var module = angular.module('myapp');

module.factory('DeleteOrderSvc', function ($http) {

    var serviceResponse = {};
    serviceResponse.getResponse = function (id, cb) {

        $http({
            url: 'http://localhost:8095/orderinventory/deleteorder',
            method: 'POST',
            data: "id=" + id,
            headers: { 'Content-Type': 'application/json' }
        }).then(function (resp) {
            cb(resp.data);
        }, function (resp) {

        });
    }
    return serviceResponse;
});