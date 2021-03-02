package uz.ruslan.blog.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.ruslan.blog.models.Post;

import javax.persistence.Entity;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
