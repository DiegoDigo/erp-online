'use strict';

/**
 * @ngdoc function
 * @name yapp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of yapp
 */
angular.module('yapp')
  .controller('LoginCtrl', function($scope, $location, loginService) {

    $scope.submit = function() {

      $location.path('/dashboard');

      return false;
    };
	
    $scope.usuario = {
    	login: undefined,
    	password: undefined
    }
    
	$scope.autenticar = function(){
		
	  loginService.fazLogin($scope.usuario).success(function(result){
		console.log(result);
	  });
		
	};
	
	$scope.init = function(){
		
	};
	
	$scope.init();

  });
