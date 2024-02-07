public class OnlyPopFilter implements GenreFilter {
    @Override
    public boolean permit(Album a) {
        return a.genre().equals(Album.Genre.POP.toString());
    }
}