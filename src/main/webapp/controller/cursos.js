var cursosModulo = angular.module('cursosModulo', []);
cursosModulo.controller("cursosController", function($scope, $http) {
	
	urlProfessores = 'http://localhost:8080/CadastroProfessores/app/professores';
	urlCursos = 'http://localhost:8080/CadastroProfessores/app/cursos';


	$scope.listarCursos = function() {

		$http({
			method: 'GET',
			url: urlCursos
		}).then(function successCallback(response) {
			$scope.cursos = response.data;
			console.log(response.data);
		}, function errorCallback(response) {
			alert(response);
		});

	}

	$scope.listarProfessores = function() {

		$http({
			method: 'GET',
			url: urlProfessores
		}).then(function successCallback(responseProfessores) {
			$scope.professores = responseProfessores.data;
			console.log(responseProfessores.data);
		}, function errorCallback(responseErro) {
			alert(responseErro);
		});

	}


	$scope.limparCampos = function() {
		$scope.curso = null;
	}

	$scope.selecionaCurso = function(cursoSelecionado) {
		$scope.curso = cursoSelecionado;
	}

	$scope.excluir = function() {
		if ($scope.curso.codigoCurso == undefined) {
			alert("Favor selecionar registro para excluir");
		} else {
			$http.delete(urlCursos + ' / ' + $scope.curso.codigoCurso).then(function() {
				$scope.listarCursos();
				$scope.limparCampos();
			})
		}
	}


	$scope.salvar = function() {
		if ($scope.curso.codigoCurso == undefined) {

			$http.post(urlCursos, $scope.curso).then(function successCallback() {
				$scope.cursos.push($scope.curso);
				$scope.limparCampos();
			}, function(curso) {
				alert(curso);
			});
		} else {
			$http.put(urlCursos, $scope.curso).then(function() {
				$scope.listarCursos();
				$scope.limparCampos();
			}, function(curso) {
				alert(curso);
			});
		}
	}




	//o metodo neste scopo sera executado primeiro
	$scope.listarCursos();
	$scope.listarProfessores();


});																																															