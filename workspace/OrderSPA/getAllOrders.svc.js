var module = angular.module('myapp');

module.factory('GetOrdersListSvc', function ($http) {

    var serviceResponse = {};
    serviceResponse.getResponse = function (cb) {
        $http({
            url: 'http://localhost:8095/orderinventory/getallorders',
            method: 'GET'
        }).then(function (resp) {
            cb(resp.data);
        }, function (resp) {
        });
    }
    return serviceResponse;
});