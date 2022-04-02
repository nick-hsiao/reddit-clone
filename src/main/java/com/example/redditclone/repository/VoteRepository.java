package com.example.redditclone.repository;

import com.example.redditclone.model.Post;
import com.example.redditclone.model.User;
import com.example.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
