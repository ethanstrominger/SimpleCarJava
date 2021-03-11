'use strict';

const answer = require('./Car');

describe('answer', () => {
  it('to life the universe and everything', () => {
    expect(answer()).toEqual(42);

  });
});