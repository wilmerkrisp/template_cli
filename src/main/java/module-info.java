import lombok.NonNull;//@NOTNULL

//import java.util.List;                                  //usual list
//import io.vavr.collection.List;                         //immutable List
//import com.google.common.collect.*;                     //ImmutableList

//@Header@
//--------------------------------------------------------------------------------
//
//                          graph
//                           wilmer 2019/05/30
//
//--------------------------------------------------------------------------------

/**
 * <pre>
 *
 * The program consists of one module
 *
 * </pre>
 */

module graph {

exports life.expert.algo.research.app;
exports life.expert.algo.research.base;

requires java.logging;

//	requires himalaya;

requires vavr;
requires static lombok;
requires static vavr.match;
requires com.google.common;
requires org.apache.commons.lang3;
requires org.apache.commons.io;

requires cyclops;
////requires cyclops.reactive.collections;

//requires com.google.gson;

//requires org.jetbrains.annotations;
//requires error.prone.annotations;
requires reactor.core;

requires org.slf4j;

requires life.expert;

//requires testng;
//requires manifold.all;

//requires org.junit.jupiter.api;
//requires org.junit.jupiter.engine;
//requires org.junit.platform.commons;
//requires org.junit.platform.engine;
//requires junit;
//requires org.junit.platform.engine;

}