angular.module('yama-config', [])

.constant('oauthConfig', {authorizePath:'/oauth/authorize',tokenPath:'/oauth/token',template:'views/oauth2.html',responseType:'token',site:'http://localhost:8080',clientId:'419c6697-14b7-4853-880e-b68e3731e316',redirectUri:'http://localhost:8080',scope:'read write'})

;