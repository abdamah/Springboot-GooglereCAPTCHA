## Springboot-GooglereCAPTCHA
Spring boot project with Google reCAPTCHA API v2. 

This is simple project by implementing Google reCAPTCHA api by using spring boot. To do this project you can follow below steps:

# Steps:
1. Go to google # GoogleRecaptchaAdmin by login your gmail account.
2. Create reCAPTCHA label by giving:

        1. Name
        2. Select version v2 ( "I'm not a robot" tickbox
        3. Domain
        4. Accept reCAPTCHA terms.
        5. Submit.
        
  Then it will generate for #TWO secret key
  
        1. Client Side secret key
        2. Server Side secret key
   After this follow API Documentation provided by reCAPTCHA .
   
   
   # Spring boot project
   As usually create normal spring boot project by providing jars/dependencies Spring Web, Spring JPA, H2 Database, Thymeleaf, Lombok
   
   Hint: Use RestTemplate to access request and response of JSON objects.
   
   https://github.com/abdamah/Springboot-GooglereCAPTCHA/blob/main/GoogleCaptchaApp/recaptcha.png
