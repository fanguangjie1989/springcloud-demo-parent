##结构
#####spring-security-web
>> * Contains filters and related web-security infrastructure code

#####spring-security-config
>> * xml config or java config


#####Method Security Expressions
>> * 1 @EnableGlobalMethodSecurity
>> * 2 prePostEnabled = true 可以使用@PreAuthorize, @PreFilter, @PostAuthorize and @PostFilter
>>>> * 2.1 @PreAuthorize decides whether a method can actually be invoked or not
>>>> * 2.2 @PostAuthorize access-control check after the method has been invoked
>>>> * 2.3 @PostFilter iterates through the returned collection and removes any elements for which the supplied expression is false
>> * 3 securedEnabled = true 可以使用@Secured("ROLE_ADMIN")
>> * 4 @Secured vs @PreAuthorize 
>>>> * 4.1 @Secured("ROLE_ADMIN")  same as @PreAuthorize("hasRole('ROLE_ADMIN')")
>>>> * 4.2 @Secured({"ROLE_USER", "ROLE_ADMIN") same as  @PreAuthorize("hasRole('ADMIN')   
OR hasRole('USER')")
>>>> * 4.3 cannot  
express the  AND condition using @Secured
>>>> * 4.4 @PreAuthorize powerful than @Secured


