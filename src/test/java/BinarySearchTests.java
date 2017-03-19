import org.junit.Test;

import edu.iis.mto.bsearch.SearchResult;
import edu.iis.mto.bsearch.BinarySearch;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by adrian on 2017-03-19.
 */
public class BinarySearchTests {

    @Test
    public void elementIsInSingleSequence() {
        int[] seq = { 3 };
        SearchResult searchResult = BinarySearch.search(3, seq);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void elementIsNotInSingleSequence(){
        int[] seq = {3};
        SearchResult searchResult = BinarySearch.search(2, seq);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void elementIsFirstInMultipleSequence(){
        int[] seq = {3, 4, 5, 6, 7};
        SearchResult searchResult = BinarySearch.search(3, seq);
        assertThat(searchResult.getPosition(), is(1));
    }

    @Test
    public void elementIsLastInMultipleSequence(){
        int[] seq = {3, 4, 5, 6, 7};
        SearchResult searchResult = BinarySearch.search(7, seq);
        assertThat(searchResult.getPosition(), is(5));
    }

    @Test
    public void elementIsMiddleInMultipleSequence(){
        int[] seq = {3, 4, 5, 6, 7};
        SearchResult searchResult = BinarySearch.search(5, seq);
        assertThat(searchResult.getPosition(), is(3));
    }

    @Test
    public void elementIsNotInMultipleSequence(){
        int[] seq = {3, 4, 5, 6, 7};
        SearchResult searchResult = BinarySearch.search(8, seq);
        assertThat(searchResult.isFound(), is(false));
    }
}

