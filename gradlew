#!/usr/bin/env sh

# Intentar encontrar Java
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

# Ejecutar Gradle con los argumentos proporcionados
exec "$JAVACMD" -classpath "gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
