Android Basic Fragment Example
==============================

A dangerous app creates a permission for activities to launch it.

Another app indicates that it requires that permission and then launches it via implicit event.

Also loading browser bookmarks with a different permission from the browser.

![permissions screenshot](https://github.com/joninvski/android_permissions_example/raw/master/images/app.png)

Compile
-------

    # Optional
    ANDROID_HOME=/home/.../android/sdk; export ANDROID_HOME

    ./gradlew compileDebug

Test
----

    # Make sure emulator is running or connected to real device
    ./gradlew connectedInstrumentTest


Code highlights
---------------

In the AndroidManifest.xml of the DangerousActivity add the permission required to launch it


    <!--
          TODO - Using a permission element,
          define a custom permission with name
    		  "course.labs.permissions.DANGEROUS_ACTIVITY_PERM"
          and "dangerous" protection level.
    -->
    <permission android:description="@string/permission_description"
           android:label="string resource"
            android:name="course.labs.permissions.DANGEROUS_ACTIVITY_PERM"
            android:protectionLevel="dangerous" />


Say the activity will respond to implicit event DANGEROUS_ACTIVITY

    <activity
        android:name=".DangerousActivity"
        android:label="@string/app_name" >

        <!--
             TODO - add additional intent filter info so that this Activity
              will respond to an Implicit Intent with the action
              "course.labs.permissions.DANGEROUS_ACTIVITY"
        -->
        <intent-filter>
            <action android:name="course.labs.permissions.DANGEROUS_ACTIVITY" />
            <category android:name="android.intent.category.DEFAULT" />
        </intent-filter>


The application calling the dangerous activity must require permission in the AndroidManifest.xml

    <!-- TODO - add uses-permission elements -->
    <uses-permission android:name="course.labs.permissions.DANGEROUS_ACTIVITY_PERM" />
    <uses-permission android:name="com.android.browser.permission.READ_HISTORY_BOOKMARKS" />
