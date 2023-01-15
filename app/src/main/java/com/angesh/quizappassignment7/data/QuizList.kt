package com.angesh.quizappassignment7.data

import com.angesh.quizappassignment7.constants.Constant.IS_CHECK_BOX
import com.angesh.quizappassignment7.constants.Constant.IS_RADIO_BUTTON

class QuizList {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1.How can we kill an activity in android?",
                    IS_CHECK_BOX,
                    "The finish() method is used to close the activity. Whereas the finishActivity(int requestCode) also closes the activity with requestCode.",
                    "ab",
                    "Using finish() method,Using finishActivity(int requestCode)",
                    "",
                    "",
                    mutableListOf("Using finish() method","Using finishActivity(int requestCode)","Using Dalvik converter","None of above")
                ),
                Quiz(
                    2,
                    "2. What is an activity in android?",
                    IS_RADIO_BUTTON,
                    "A activity is a single screen in an application.",
                    "c",
                    "A single screen in an application with supporting java code",
                    "",
                    "",
                    mutableListOf("android class","android package","A single screen in an application with supporting java code","None of the above")
                ),
                Quiz(
                    3,
                    "3. State whether true or false:  Android is built upon the Java micro edition(J2ME) version of Java.\n",
                    IS_RADIO_BUTTON,
                    "False. Android is not built upon the Java micro edition(J2ME) version of Java.",
                    "b",
                    "False",
                    "",
                    "",
                    mutableListOf("True","False")
                ),
                Quiz(
                    4,
                    "4. Among the below virtual machines choose the one which is used by the Android operating system",
                    IS_RADIO_BUTTON,
                    "Android uses Dalvik virtual system.",
                    "a",
                    "Dalvik virtual machine",
                    "",
                    "",
                    mutableListOf("Dalvik virtual machine","JVM","Simple Virtual Machine","None of the above")
                ),
                Quiz(
                    5,
                    "5. All layout classes are the subclasses of",
                    IS_RADIO_BUTTON,
                    "all layout classes are the subclasses of android.view.ViewGroup in android.",
                    "c",
                    "android.view.ViewGroup",
                    "",
                    "",
                    mutableListOf("android.widget","android.view.View","android.view.ViewGroup","None")
                ),
                Quiz(
                    6,
                    "6. The full form of APK is _____",
                    IS_RADIO_BUTTON,
                    "APK stands for Android package kit.",
                    "c",
                    "Android Package Kit",
                    "",
                    "",
                    mutableListOf("Android Page Kit","Android Phone Kit","Android Package Kit","Android Photo Kit")
                ),
                Quiz(
                    7,
                    "7. What is manifest XML in android?",
                    IS_RADIO_BUTTON,
                    "It has all the information about an application.",
                    "b",
                    "It has all the information about an application.",
                    "",
                    "",
                    mutableListOf("It has information about layout in an application","It has all the information about an application","It has the information about activities in an application", "None")
                ),
                Quiz(
                    8,
                    "8. On which of the following, developers can test the application, during developing the android applications?",
                    IS_CHECK_BOX,
                    "We can use the Android emulator, physical android phone, or third-party emulator as a target device to execute and test our Android application.",
                    "abc",
                    "-Emulator included in Android SDK\n-Third-party emulators\n-Physical android phone",
                    "",
                    "",
                    mutableListOf("Third-party emulators","Emulator included in Android SDK","Physical android phone")
                ),
                Quiz(
                    9,
                    "9. What is the use of a content provider in Android?",
                    IS_RADIO_BUTTON,
                    "Content providers can help an application manage access to data stored by itself, stored by other apps, and provide a way to share data with other apps.",
                    "c",
                    "For sending the data from an application to another application",
                    "",
                    "",
                    mutableListOf("For sharing the data between application","For storing the data in the database", "For sending the data from an application to another application", "None of the above")
                ),
                Quiz(
                    10,
                    "10. Which of the following is not an activity lifecycle callback method?",
                    IS_RADIO_BUTTON,
                    "onBackPressed() method is not an activity lifecycle callback method",
                    "d",
                    "onBackPressed() method",
                    "",
                    "",
                    mutableListOf("onClick() method","onCreate() method","onStart() method","onBackPressed() method")
                ),
                Quiz(
                    11,
                    "11. While developing android application developers can test their apps on?",
                    IS_RADIO_BUTTON,
                    "Apps can be tested in all the sources mentioned above.",
                    "d",
                    "All the above",
                    "",
                    "",
                    mutableListOf("Emulators in Android SDK","Android Phone","Third-Party Emulator","All the above")
                ),
                Quiz(
                    12,
                    "12. Which of the following is a dialog class in android?",
                    IS_CHECK_BOX,
                    "All of the above are Dialog classes",
                    "abc",
                    "AlertDialog\nDatePicker Dialog\nProgressDialog",
                    "",
                    "",
                    mutableListOf("AlertDialog","DatePicker Dialog","ProgressDialog")
                ),
                Quiz(
                    13,
                    "13. In android, mini activities are also known as",
                    IS_RADIO_BUTTON,
                    "In android, mini activities are also known as Fragments",
                    "c",
                    "Fragments",
                    "",
                    "",
                    mutableListOf("Adapter","Activity","Fragments","None of the above")
                ),
                Quiz(
                    14,
                    "14. Choose the correct option related to Android.",
                    IS_RADIO_BUTTON,
                    "Android is a Linux-based mobile operating system that primarily runs on smartphones and tablets.",
                    "b",
                    "Android is an Operating System",
                    "",
                    "",
                    mutableListOf("Android is a web browser","Android is an Operating System","Android is a web server","None")
                ),
                Quiz(
                    15,
                    "15.Among the following choose the one which converts Java bytecode into Dalvik bytecode",
                    IS_RADIO_BUTTON,
                    "dex compiler converts convert JAVA bytecode into Dalvik bytecode.",
                    "c",
                    "dex compiler",
                    "",
                    "",
                    mutableListOf("dex compiler","Mobile interpretive compare","Dalvik converter","None")
                )
            )
        }
    }
}