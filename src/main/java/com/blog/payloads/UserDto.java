package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;

    @NotEmpty
    @Size(min = 4, message = "User name must be at least 4 characters long !!")
    private String name;

    @Email(message = "Email address is not valid !!")
    private String email;

    @NotEmpty
    @Size(min = 5, max = 10, message = "Password must be min of 5 chars and maximum 10 chars long !!")
    private String password;

    @NotEmpty
    private String about;
}
