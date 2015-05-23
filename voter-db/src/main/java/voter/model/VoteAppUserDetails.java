package voter.model;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class VoteAppUserDetails implements UserDetails {

	private final String username;
	private final String password;
	private final boolean enabled;
	private final boolean locked;
	private final Date expiry;
	private final Date passwordExpiry;
	private final Set<? extends GrantedAuthority> authorities;

	public VoteAppUserDetails(final String username, final String password,
			final boolean enabled, final boolean locked, final Date expiry, final Date passwordExpiry,
			final Set<? extends GrantedAuthority> authorities) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.locked = locked;
		this.expiry = expiry;
		this.passwordExpiry = passwordExpiry;
		this.authorities = authorities;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAccountNonExpired() {
		return expiry.after(new Date());
	}

	public boolean isAccountNonLocked() {
		return locked;
	}

	public boolean isCredentialsNonExpired() {
		return passwordExpiry.after(new Date());
	}

	public boolean isEnabled() {
		return enabled;
	}


}
