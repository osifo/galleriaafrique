package com.galleriafrique;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Created by osifo on 8/3/15.
 */
public class Constants {
    public static final String ENDPOINT                     = "http://52.34.197.169/api";
    public static final String PAGE_NUMBER                  = "page";
    public static final String TAG                          = "Galleriafrique";
    public static final String START_DATE                   = "startDate";
    public static final String END_DATE                     = "endDate";
    public static final String PARAM_POST_IMAGE             = "post[image]";
    public static final String PARAM_POST_DESCRIPTION       = "post[description]";
    public static final String PARAM_POST_USER_ID           = "post[user_id]";
    public static final String PARAM_USER_ID                = "user_id";
    public static final String PARAM_USER_EMAIL             = "email";
    public static final String PARAM_USER_PASSWORD          = "password";
    public static final String PARAM_POST_ID                = "post_id";
    public static final String PARAM_FOLLOWER_ID            = "follower_id";
    public static final String PARAM_FOLLOWED_ID            = "followed_id";
    public static final String GET_POSTS_FAILED             = "Posts could not be loaded, Try again.";
    public static final String CREATE_POSTS_FAILED          = "Posts could not be created, Try again.";
    public static final String POST_NEW_COMMENT             = "Posting your comment...";
    public static final String ADD_COMMENT_FAILED           = "Comment could not be posted. Try again.";
    public static final SimpleDateFormat DATE_FORMAT        = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss ZZZZ");

    public static final String USER_DATA                    = "user";
    public static final String SHARE_WITH                   = "Share this post with";
    public static final String FAVORITE_POST_FAILED         = "Post could not be shared. Please try again";
    public static final String PARAM_TEXT                   = "text";

    public static final String GET_FOLLOWERS_FAILED         = "Followers could not be fetched. Please retry";
    public static final String GET_FOLLOWING_FAILED         = "Following list could not be fetched. Please retry";
    public static final String GET_USER_POSTS_FAILED        = "User Posts could not be fetched. Please retry";
    public static final String GET_USER_FAVORITES_FAILED    = "User's favorites could not be fetched. Please retry";
    public static final String FOLLOW_USER_FAILED           = "Could not follow this user. Please retry";
    public static final String UNFOLLOW_USER_FAILED         = "Could not unfollow this user. Please retry";

    public static final Pattern EMAIL_PATTERN               = Pattern.compile("^([a-z]([a-z\\d][_\\-\\.]{0,1})*)\\@([a-z\\d]+[_\\-\\.]?){1,2}(\\.[a-z]{2,3}){1,2}$");
    public static final String IMAGE_DIRECTORY_NAME         = "Galleria Afrique";
}
