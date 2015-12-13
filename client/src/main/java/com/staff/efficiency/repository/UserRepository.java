package com.staff.efficiency.repository;

import com.staff.efficiency.models.UserModel;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepository {
    private final static String QUERY_RANDOM_USER = "select user_name from user_info offset floor(random()*3) limit 1;";


    public UserModel getRandomUser() {
        return querySingleObjectOrNull(QUERY_RANDOM_USER, ps -> {
        }, (rs, r) -> new UserModel(rs.getString(1)));
    }
}
