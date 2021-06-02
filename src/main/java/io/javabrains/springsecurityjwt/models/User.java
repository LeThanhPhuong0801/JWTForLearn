package io.javabrains.springsecurityjwt.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "ol__user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

	@Id
	private String id;

	@Column(name = "dtype")
	private String Type;

	@Column(name = "username", length = 128, unique = true)
	private String userName;

	@Column(name = "password", length = 128)
	private String password;

	@Column(name = "salt", length = 64)
	private String salt;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "confirmation_token")
	private String confirmationToken;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "api_key")
	private String apiKey;

	@Column(name = "action_token", length = 20)
	private String actionToken;

	@Column(name = "referral_customer_email", length = 128)
	private String referralCustomerEmail;

	@Column(name = "status_type")
	private String statusType;

	@Column(name = "status_state")
	private String statusState;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "allow_point_transfer")
	private Boolean allowPointTransfer;

	@Column(name = "external")
	private Boolean external;

	@Column(name = "newsletter_used_flag")
	private Boolean newsletterUsedFlag;

	@Column(name = "create_at")
	private LocalDateTime createAt;

	@Column(name = "password_requested_at")
	private LocalDateTime passwordRequestedAt;

	@Column(name = "temporary_password_set_at")
	private LocalDateTime temporaryPasswordSetAt;

	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;

	@Column(name = "last_login_at")
	private LocalDateTime lastLoginAt;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getActionToken() {
		return actionToken;
	}

	public void setActionToken(String actionToken) {
		this.actionToken = actionToken;
	}

	public String getReferralCustomerEmail() {
		return referralCustomerEmail;
	}

	public void setReferralCustomerEmail(String referralCustomerEmail) {
		this.referralCustomerEmail = referralCustomerEmail;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	public String getStatusState() {
		return statusState;
	}

	public void setStatusState(String statusState) {
		this.statusState = statusState;
	}

	public Boolean isActive() {
		return isActive;
	}

	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isAllowPointTransfer() {
		return allowPointTransfer;
	}

	public void setAllowPointTransfer(Boolean allowPointTransfer) {
		this.allowPointTransfer = allowPointTransfer;
	}

	public Boolean isExternal() {
		return external;
	}

	public void setExternal(Boolean external) {
		this.external = external;
	}

	public Boolean isNewsletterUsedFlag() {
		return newsletterUsedFlag;
	}

	public void setNewsletterUsedFlag(Boolean newsletterUsedFlag) {
		this.newsletterUsedFlag = newsletterUsedFlag;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getPasswordRequestedAt() {
		return passwordRequestedAt;
	}

	public void setPasswordRequestedAt(LocalDateTime passwordRequestedAt) {
		this.passwordRequestedAt = passwordRequestedAt;
	}

	public LocalDateTime getTemporaryPasswordSetAt() {
		return temporaryPasswordSetAt;
	}

	public void setTemporaryPasswordSetAt(LocalDateTime temporaryPasswordSetAt) {
		this.temporaryPasswordSetAt = temporaryPasswordSetAt;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}

	public LocalDateTime getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(LocalDateTime lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
