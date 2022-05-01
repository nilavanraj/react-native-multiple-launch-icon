import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import { changeIcon } from 'react-native-multiple-launch-icon';

export default function App() {
  React.useEffect(() => {
    changeIcon('.RED');
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: </Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
