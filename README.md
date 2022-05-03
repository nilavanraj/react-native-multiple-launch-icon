# react-native-multiple-launch-icon

 multiple launch icon for react native (Only for Android)

## Installation

```sh
npm install react-native-multiple-launch-icon
```

## Usage
Add the activity name and icon 
```xml
  <activity-alias
        android:label="@string/app_name"
        android:icon="@mipmap/ic_launcher"
        android:name=".RED"
        android:enabled="false"
        android:targetActivity=".MainActivity">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity-alias>
```
```js
import { changeIcon } from "react-native-multiple-launch-icon";

// activity name
changeIcon('.RED');
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
