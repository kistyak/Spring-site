package net.kistyak.site.repo;

import net.kistyak.site.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
}
