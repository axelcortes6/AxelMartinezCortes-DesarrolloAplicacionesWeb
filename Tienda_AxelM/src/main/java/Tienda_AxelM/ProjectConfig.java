/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Configuration.java to edit this template
 */
package Tienda_AxelM;


import org.springframework.context.annotation.Configuration;
import org. springframework.web. servlet.config.annotation. ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 *
 * @author User
 */

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    /* Los siguiente métodos son para implementar el tema de seguridad dentro del proyecto */
    @Override
public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("redirect:/index.html");
    registry.addViewController("/ejemplo2").setViewName("redirect:/ejemplo2.html");
    registry.addViewController("/multimedia").setViewName("redirect:/multimedia.html");
    registry.addViewController("/iframes").setViewName("redirect:/iframes.html");
}

    /* El siguiente método se utilizar para publicar en la nube, independientemente  */
 
    }

