package org.mag2.models.data;

public class MetaData {

    private String projectName;
    private String projectId;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "projectName='" + projectName + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
