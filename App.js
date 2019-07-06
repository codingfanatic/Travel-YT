import React, {Component} from 'react';
import {View, StyleSheet, Text} from 'react-native';

export default class App extends Component {
  render() {
    return (
      <View style={styles.parent}>

        <View style={styles.titles}>
        </View>

        <View style={styles.options}>
        </View>
        
        <View style={styles.footer}>
        </View>

      </View>
    );
  }
}

const styles = StyleSheet.create({
  parent: {
    flex: 1,
  },

  titles: {
    flex: 2,
    backgroundColor: '#000000',
  },

  options: {
    flex: 1,
    backgroundColor: '#000000',
  },

  footer: {
    flex: 1,
    backgroundColor: '#000000',
  },
});

