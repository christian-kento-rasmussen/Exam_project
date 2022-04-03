package dtu.projectmanagement;

import dtu.projectmanagement.app.ManagementApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertNotNull;

public class ProjectSteps {
    ManagementApp managementApp;

    public ProjectSteps(ManagementApp managementApp){
        this.managementApp = managementApp;
    }

    @Given("a project is created")
    public void aProjectIsCreated() {
        managementApp.createNewProject();
    }

    @Given("there is a project")
    public void there_is_a_project() {
        managementApp.createNewProject();
         //Temporary fix
    }

    @Then("There exist a project with number {string}")
    public void thereExistAProjectWithNumber(String project_number) {
        assertNotNull(managementApp.getProject(project_number));
    }

}
