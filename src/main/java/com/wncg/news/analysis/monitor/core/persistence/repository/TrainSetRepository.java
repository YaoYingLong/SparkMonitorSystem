package com.wncg.news.analysis.monitor.core.persistence.repository;

import com.wncg.news.analysis.monitor.web.model.TrainSet;

import java.util.List;

public interface TrainSetRepository {

    List<TrainSet> queryTrainSetByPage(int pageSize, int pageNum, int labelType);

    TrainSet queryTrainSetById(String id);

    Long queryTrainSetCount(int labelType);

    TrainSet updateTrainSet(TrainSet oldTrainSet, TrainSet newTrainSet);

    void deleteTrainSet(TrainSet trainingSet);

    void addTrainSet(TrainSet trainingSet);

    List<TrainSet> queryAllTrainSet();

}
