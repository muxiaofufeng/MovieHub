package com.etiennelawlor.moviehub.data.source.tv;

import com.etiennelawlor.moviehub.data.model.TelevisionShowDetailsWrapper;
import com.etiennelawlor.moviehub.data.model.TelevisionShowsPage;

import rx.Observable;

/**
 * Created by etiennelawlor on 2/13/17.
 */

public interface TelevisionShowDataSourceContract {

    interface Repository {
//        Restful VERB is the first part of method name GET , POST , DELETE, PUT
        Observable<TelevisionShowsPage> getPopularTelevisionShows(int currentPage);
        Observable<TelevisionShowDetailsWrapper> getTelevisionShowDetails(int currentPage);
    }

    interface LocalDateSource {
        Observable<TelevisionShowsPage> getPopularTelevisionShows(int currentPage);
        void savePopularTelevisionShows(TelevisionShowsPage televisionShowsPage);

        Observable<TelevisionShowDetailsWrapper> getTelevisionShowDetails(int currentPage);
        void saveTelevisionShowDetails(TelevisionShowDetailsWrapper televisionShowDetailsWrapper);
    }

    interface RemoteDateSource {
         Observable<TelevisionShowsPage> getPopularTelevisionShows(int currentPage);

         Observable<TelevisionShowDetailsWrapper> getTelevisionShowDetails(int currentPage);
    }
}
