var module = angular.module('myapp');

module.controller('OrderController', OrderController);

function OrderController($scope, GetOrdersListSvc, DeleteOrderSvc, $window,CreateOrderSvc) {

    GetOrdersListSvc.getResponse(function (result) {
        console.log(result.list);
        $scope.orderList = result.list;
    });

    $scope.deleteOrder = function () {
        console.log($scope.id);
        if ($scope.id) {
            DeleteOrderSvc.getResponse($scope.id, function (result) {
                console.log(result);
                $scope.deleteStatus=result.status;
            });
            $window.location.reload();
        }else{
            alert("select an order that needs to be deleted");
        }
    };

    $scope.selectOrder = function (id) {
        $scope.selectedOrder = this.orderList[id]
    };

    $scope.createOrder = function () {
        $scope.createButtonClicked = true;
    };

    $scope.submit = function(){
        console.log($scope.id);
        CreateOrderSvc.getResponse($scope, function (result) {
            console.log(result);
            $scope.createStatus=result.status;
        });

    }
    
        
    
}