package life.expert.algo.research.app;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/01/23
//
//--------------------------------------------------------------------------------









import java.io.InputStream;

import java.util.ResourceBundle;
import java.util.concurrent.Flow;
import java.util.logging.LogManager;


import life.expert.algo.research.base.AlgoOne;
import life.expert.common.async.ThreadUtils;
import life.expert.common.base.ApplicationUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.vavr.API.print;
import static java.text.MessageFormat.format;           //format string

import java.util.ResourceBundle;

import static com.google.common.base.Preconditions.*;   //checkArgument

import static org.apache.commons.lang3.Validate.*;      //notEmpty(collection)

import org.apache.commons.lang3.StringUtils;            //isNotBlank

import java.util.function.*;                            //producer supplier

import static java.util.stream.Collectors.*;            //toList streamAPI
import static java.util.function.Predicate.*;           //isEqual streamAPI

import java.util.Optional;


import static reactor.core.publisher.Mono.*;
import static reactor.core.scheduler.Schedulers.*;
import static life.expert.common.async.LogUtils.*;
import static life.expert.common.base.Objects.*;        //deepCopyOfObject
//import static life.expert.common.base.Preconditions.*;  //checkCollection


//import static io.vavr.API.*;                            //switch
import static io.vavr.Predicates.*;                     //switch - case
import static io.vavr.Patterns.*;                       //switch - case - success/failure

//import java.util.List;                                 //usual list
//import io.vavr.collection.List;                        //immutable List
//import com.google.common.collect.*;                   //ImmutableList









/**
 * The type App.
 */
@Slf4j
public class Application
	{
	
	
	
	private static final ResourceBundle bundle_ = ResourceBundle.getBundle( "messages" );
	
	
	
	private static final String START_MESSAGE_ = bundle_.getString( "startProgram" );
	
	
	
	private static final String END_MESSAGE_ = bundle_.getString( "endProgram" );
	
	
	
	/**
	 * Main method
	 *
	 * @param args
	 * 	command line input arguments
	 */
	public static void main( final String... args )
		{
		try
			{
			//System.out.println( "VV_main main " );
			// new feature
			// test 22
			// test
			log( START_MESSAGE_ );
			
			print( "Hello world!\n" );
			
			AlgoOne a = AlgoOne.of();
			a.run();
			
			
			
			log( END_MESSAGE_ );
			
			//ThreadUtils.delay( 30 );
			}
		catch( Error error )
			{
			ApplicationUtils.fatalError( error );
			}
			
		}
		
		
		
	}
