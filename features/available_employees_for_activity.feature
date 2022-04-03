Feature: Find available employees for activity
	Description: Find all available employees for activity
	Actors: ProjectLeader

Scenario: Find available employees for activity
	Given a project is created
	And there is an employee with username "MRBE"
	And there is an employee with username "PEWD"
	And a project is created
	And there is an activity with activityName "save the world", start week 10, and end week 15 contained in the project
	And employee "MRBE" is attached to activity "save the world"
	And there is an activity with activityName "From the algorithm", start week 16, and end week 20 contained in the project
	Then available employees for activityName "From the algorithm" is "PEWD"

Scenario: No available employees for activity
	Given a project is created
	And there is an employee with username "MRBE"
	And there is an employee with username "PEWD"
	And there is an activity with activityName "save the world", start week 10, and end week 15 contained in the project
	And employee "MRBE" is attached to activity "save the world"
	And there is an activity with activityName "From the algorithm", start week 12, and end week 20 contained in the project
	Then there is no available employees for activityName "From the algorithm"