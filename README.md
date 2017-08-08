# micrometer-issue-73

```
$ ./gradlew bootRun
:compileJava
micrometer-issue-73/src/main/java/com/example/demo/MicrometerIssue73Application.java:26: error: cannot access Cache
            return Meters.monitor(registry,
                         ^
  class file for com.google.common.cache.Cache not found
1 error
:compileJava FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 1.751 secs
```
