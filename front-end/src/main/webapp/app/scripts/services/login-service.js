'use strict';

angular.module('yapp').service('loginService', function($http, config) {

	var _url = config.baseUrl + "/front/login";

	var _fazLogin = function(usuario) {
		return $http.post(_url + '/efetua/', usuario);
	};

	return {
		fazLogin : _fazLogin
	};
});
