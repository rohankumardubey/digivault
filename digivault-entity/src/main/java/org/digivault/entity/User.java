package org.digivault.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.company.digivault.models.Gender;
import org.company.digivault.queries.UserNamedQueries;

@Entity
@Table(name = "digivault_user")
@NamedQueries({
        @NamedQuery(name = UserNamedQueries.GET_USER_BY_EMAIL_KEY, query = UserNamedQueries.GET_USER_BY_EMAIL_VALUE),
        @NamedQuery(name = UserNamedQueries.GET_USER_BY_CONTACT_KEY, query = UserNamedQueries.GET_USER_BY_CONTACT_VALUE)
})
public class User extends BaseEntity {

  @Column(name = "active")
  private boolean active = true;

  @Column(name = "name")
  private String name;

  @Column(name = "dob")
  private String dob;

  @Column(name = "gender")
  @Enumerated(EnumType.STRING)
  private Gender gender;

  @Column(name = "contact_num")
  private String contactNum;

  @Column(name = "password")
  @JsonIgnore
  private String password;

  @Column(name = "email")
  private String email;

  @Column(name = "email_verified")
  private boolean isEmailVerified = false;

  @Column(name = "pan")
  private String pan;

  @Column(name = "aadhar")
  private String aadhar;

  @Column(name = "gcm_id")
  private String gcmId;

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getContactNum() {
    return contactNum;
  }

  public void setContactNum(String contactNum) {
    this.contactNum = contactNum;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isEmailVerified() {
    return isEmailVerified;
  }

  public void setEmailVerified(boolean emailVerified) {
    isEmailVerified = emailVerified;
  }

  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public String getAadhar() {
    return aadhar;
  }

  public void setAadhar(String aadhar) {
    this.aadhar = aadhar;
  }

  public String getGcmId() {
    return gcmId;
  }

  public void setGcmId(String gcmId) {
    this.gcmId = gcmId;
  }
}
