CREATE TABLE event_successor
(
    source          VARCHAR(32) PRIMARY KEY NOT NULL,
    event_successor VARCHAR(16) NOT NULL
);

CREATE TABLE reset_event_successor
(
    source          VARCHAR(32) PRIMARY KEY NOT NULL,
    event_successor VARCHAR(16) NOT NULL
);
