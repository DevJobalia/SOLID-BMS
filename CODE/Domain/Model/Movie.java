package CODE.Domain.Model;

import java.util.ArrayList;
import java.util.List;

import CODE.Domain.Enum.Genre;

public class Movie {
    private final String movieID;
    private final String title;
    private final Genre genre;
    private final float duration;
    private final float rating;

    // Private constructor to enforce usage via builder
    private Movie(Builder builder) {
        this.movieID = builder.movieID;
        this.title = builder.title;
        this.genre = builder.genre;
        this.duration = builder.duration;
        this.rating = builder.rating;
    }

    public String getId() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public float getDuration() {
        return duration;
    }

    public float getRating() {
        return rating;
    }

    public void getMovie() {
        // Print or return movie details
    }

    public List<Show> getShows() {
        return new ArrayList<>();
    }

    // ✅ Static Builder Class
    public static class Builder {
        private String movieID;
        private String title;
        private Genre genre;
        private float duration;
        private float rating;

        public Builder setMovieID(String movieID) {
            this.movieID = movieID;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setGenre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public Builder setDuration(float duration) {
            this.duration = duration;
            return this;
        }

        public Builder setRating(float rating) {
            this.rating = rating;
            return this;
        }

        public Movie build() {
            // Optional: Add validations before building
            return new Movie(this);
        }
    }
}
