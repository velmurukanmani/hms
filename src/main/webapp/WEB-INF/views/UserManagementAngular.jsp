
<html lang="en">
<head>
<link rel="stylesheet"
	href="webjars/angular-material/1.0.9/angular-material.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">

<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body ng-app="BlankApp" ng-cloak>

<md-checkbox ng-model="isChecked" aria-label="Finished?">
  Finished ?
</md-checkbox>

<md-checkbox md-no-ink ng-model="hasInk" aria-label="No Ink Effects" class="md-primary">
  No Ink Effects
</md-checkbox>

<md-checkbox ng-disabled="true" ng-model="isDisabled" aria-label="Disabled">
  Disabled
</md-checkbox>

<md-datepicker ng-model="birthday"></md-datepicker>

<md-button class="md-fab md-accent" aria-label="Play">
  <md-tooltip>Play Music</md-tooltip>
  <md-icon md-svg-src="img/icons/ic_play_arrow_24px.svg"></md-icon>
</md-button>

	<!-- Angular Material Dependencies -->
	<script src="webjars/angular/1.6.8/angular.min.js"></script>
	<script src="webjars/angular-animate/1.6.9/angular-animate.min.js"></script>
	<script src="webjars/angular-aria/1.6.9/angular-aria.min.js"></script>
	<script src="webjars/angular-messages/1.6.9/angular-messages.min.js"></script>

	<script src="webjars/angular-material/1.0.9/angular-material.min.js"></script>

	<!-- Your application bootstrap  -->
	<script type="text/javascript">    
    /**
     * You must include the dependency on 'ngMaterial' 
     */
    angular.module('BlankApp', ['ngMaterial']);
    
  </script>

</body>
</html>