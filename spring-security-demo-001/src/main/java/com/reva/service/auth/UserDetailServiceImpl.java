

package com.reva.service.auth;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @author Raviraj S Mahamuni
 * @date 17-Nov-2018
 * @since 1.0
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.security.core.userdetails.UserDetailsService#
     * loadUserByUsername(java.lang.String)
     */
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // Autowire userdao to Access the user by using username and the map the
        // query result to UserDetails object

        User user = new User();

        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setEnabled(true);
        user.setPassword("123".toCharArray());
        user.setUsername(username);

        return user;

    }

}
