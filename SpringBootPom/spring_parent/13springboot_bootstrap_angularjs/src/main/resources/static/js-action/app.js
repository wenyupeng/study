/**
 * 指定模块名称
 */
var actionApp = angular.module('actionApp',['ngRoute']);//定义模块actionApp依赖路由ngRout


/**
 * 配置路径绑定视图
 */
actionApp.config(['$routeProvider' , function($routeProvider) {//注入￥routeProvider
	
	$routeProvider.when('/oper', { 
		controller: 'View1Controller', 
		templateUrl: 'views/view1.html', 
	}).when('/directive', {
		controller: 'View2Controller',
		templateUrl: 'views/view2.html',
	});

}]);
