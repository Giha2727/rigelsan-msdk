<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/bg_void">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center"
        android:padding="40dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <View
            android:layout_width="48dp"
            android:layout_height="3dp"
            android:background="@color/rigel_gold"
            android:layout_marginBottom="20dp"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="RIGELSAN"
            android:textColor="@color/rigel_gold"
            android:textSize="32sp"
            android:textStyle="bold"
            android:fontFamily="monospace"
            android:letterSpacing="0.4"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="// MSDK V5 BAĞLANTI TESTİ"
            style="@style/RasText.Tag"
            android:layout_marginTop="6dp"
            android:layout_marginBottom="48dp"/>

        <TextView
            android:id="@+id/tvStatus"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/splash_starting"
            style="@style/RasText.Heading"
            android:gravity="center"
            android:layout_marginBottom="12dp"/>

        <TextView
            android:id="@+id/tvDetail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textColor="@color/text_secondary"
            android:textSize="12sp"
            android:fontFamily="monospace"
            android:gravity="center"
            android:lineSpacingExtra="4dp"
            android:minHeight="80dp"/>

        <ProgressBar
            android:layout_width="match_parent"
            android:layout_height="2dp"
            android:layout_marginTop="20dp"
            style="@android:style/Widget.ProgressBar.Horizontal"
            android:indeterminate="true"
            android:indeterminateTint="@color/rigel_gold"/>

    </LinearLayout>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="© RİGELSAN ARGE SAVUNMA / / v1.0.0"
        style="@style/RasText.Tag"
        android:layout_marginBottom="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

</androidx.constraintlayout.widget.ConstraintLayout>
