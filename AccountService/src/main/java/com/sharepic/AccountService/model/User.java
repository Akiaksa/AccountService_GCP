package com.sharepic.AccountService.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("id")
	private Long id = null;
	
	@JsonProperty("userName")
    private String userName = null;

	@JsonProperty("fullName")
	private String fullName = null;
	
	@JsonProperty("password")
    private String password = null;
	
	@JsonProperty("profilePicture")
    private String profilePicture = null;

	@JsonProperty("profileDescription")
    private String profileDescription = null;
	
	public User id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public User userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get userName
     *
     * @return userName
     **/
    public String getUserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }
    
    public User password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public User profilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
        return this;
    }

    /**
     * Get profilePicture
     *
     * @return profilePicture
     **/
    public String getprofilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
    
    public User profileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
        return this;
    }

    /**
     * Get profileDescription
     *
     * @return profileDescription
     **/
    public String getprofileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.id, user.id) &&
        		Objects.equals(this.userName, user.userName) &&
                Objects.equals(this.fullName, user.fullName) &&
                Objects.equals(this.profilePicture, user.profilePicture) &&
                Objects.equals(this.password, user.password) &&
                Objects.equals(this.profileDescription, user.profileDescription);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName,fullName,password, profilePicture,profileDescription);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    profileDescription: ").append(toIndentedString(profileDescription)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}