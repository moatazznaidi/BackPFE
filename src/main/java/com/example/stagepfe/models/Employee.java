package com.example.stagepfe.models;

import com.example.stagepfe.models.enumration.enumrationrole;
import lombok.AllArgsConstructor;
import lombok.*;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "employees")
public class Employee implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEmployee;

    @Column(name = "FirstName")
    private String firstName;
    private String LastName;
    private String Gender;

    private Long PhoneNumber;
    private String Discrption;

    private String Adresse;


    private Date BirthdayDate;

    private String Picture;
    private Integer Age;
    private String Login;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private enumrationrole enumrationrole;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(enumrationrole.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}








