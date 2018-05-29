package com.vanniktech.rxriddles

import io.reactivex.Observable
import io.reactivex.functions.BiFunction

object Riddle5 {
  /**
   * Sum up the latest values of [first] and [second] whenever one of the Observables emits a new value.
   *
   * Use case: Two input fields in a calculator that need to be summed up and the result should be updated every time one of the inputs change.
   */
  fun solve(first: Observable<Int>, second: Observable<Int>): Observable<Int> {
      return Observable.combineLatest(first, second, BiFunction<Int, Int, Int> { t1, t2 ->
          t1 + t2
      })
  }
}
