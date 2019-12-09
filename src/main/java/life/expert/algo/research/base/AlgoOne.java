package life.expert.algo.research.base;//@Header@
//--------------------------------------------------------------------------------
//
//                          graph  life.expert.algo.research.base
//                           wilmer 2019/02/04
//
//--------------------------------------------------------------------------------

import life.expert.common.async.ThreadUtils;
import lombok.NonNull;//@NOTNULL

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.text.MessageFormat.format;           //format string

import java.util.ResourceBundle;

import static com.google.common.base.Preconditions.*;   //checkArgument
//import static life.expert.common.base.Preconditions.*;  //checkCollection
import static org.apache.commons.lang3.Validate.*;      //notEmpty(collection)

import org.apache.commons.lang3.StringUtils;            //isNotBlank

import java.util.function.*;                            //producer supplier

import static java.util.stream.Collectors.*;            //toList streamAPI
import static java.util.function.Predicate.*;           //isEqual streamAPI

import java.util.Optional;

import static reactor.core.publisher.Mono.*;
import static reactor.core.scheduler.Schedulers.*;
import static life.expert.common.async.LogUtils.*;        //logAtInfo
import static life.expert.common.function.NullableUtils.*;//.map(nullableFunction)
import static life.expert.common.function.CheckedUtils.*;// .map(consumerToBoolean)
//import static life.expert.common.function.Patterns.*;    //for-comprehension
import static life.expert.common.base.Objects.*;          //deepCopyOfObject

import static io.vavr.API.*;                              //switch
import static io.vavr.Predicates.*;                       //switch - case
import static io.vavr.Patterns.*;                         //switch - case - success/failure
import static cyclops.control.Trampoline.more;
import static cyclops.control.Trampoline.done;

/**
 * The type Algo one.
 */
@Slf4j
public final class AlgoOne
	{

	
	// constant
	private static final long  SLEEP_TIME = 1L;
	
	
	private AlgoOne()
		{
		
		}
	
	
	public static AlgoOne of()
		{
		return new AlgoOne();
		}
	
	/**
	 * Run.
	 */
	public void run()
		{
		ThreadUtils.delay( SLEEP_TIME );
		
		}
		
	}
