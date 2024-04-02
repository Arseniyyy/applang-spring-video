package com.arsenydeveloper.applangspringvideo;

import com.arsenydeveloper.applangspringvideo.adapters.spi.tag.jpa.JpaClientCreateTag;
import com.arsenydeveloper.applangspringvideo.adapters.spi.tag.jpa.JpaClientFindTagById;
import com.arsenydeveloper.applangspringvideo.adapters.spi.video.jpa.JpaClientCreateVideo;
import com.arsenydeveloper.applangspringvideo.adapters.spi.video.jpa.JpaClientFindVideoById;
import com.arsenydeveloper.applangspringvideo.application.api.tag.usecases.CreateTagUseCase;
import com.arsenydeveloper.applangspringvideo.application.api.tag.usecases.FindTagByIdUseCase;
import com.arsenydeveloper.applangspringvideo.application.api.video.usecases.CreateVideoUseCase;
import com.arsenydeveloper.applangspringvideo.application.api.video.usecases.FindVideoByIdUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * ApplangSpringVideoApplication
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@SpringBootApplication
public class ApplangSpringVideoApplication {

	public static void main(String[] args) {
        SpringApplication.run(ApplangSpringVideoApplication.class, args);
	}

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public FindVideoByIdUseCase findVideoByIdUseCase() {
        return new FindVideoByIdUseCase(new JpaClientFindVideoById());
    }

    @Bean
    public CreateVideoUseCase createVideoUseCase() {
        return new CreateVideoUseCase(new JpaClientCreateVideo());
    }

    @Bean
    public FindTagByIdUseCase findTagByIdUseCase() {
        return new FindTagByIdUseCase(new JpaClientFindTagById());
    }

    @Bean
    public CreateTagUseCase createTagUseCase() {
        return new CreateTagUseCase(new JpaClientCreateTag());
    }
}
