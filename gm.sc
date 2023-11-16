__config() -> {
  'scope' -> 'global',
  'stay_loaded' -> true,
  'commands' -> {
    '0' -> _() -> _mode('0'),
    '1' -> _() -> _mode('1'),
    '2' -> _() -> _mode('2'),
    '3' -> _() -> _mode('3')
  },
  'arguments' -> {
    'mode' -> {
        'type' -> 'int',
        'min' -> 0,
        'max' -> 3,
        'suggest' -> [0,1,2,3]
    }
  }
};

_mode() -> run('gamemode %s '+player()~'command_name');return('&8[&em&ba&6i&7SMP&8]&f Gamemode cambiata con successo')
