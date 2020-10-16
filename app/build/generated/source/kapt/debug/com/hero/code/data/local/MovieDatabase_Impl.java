package com.hero.code.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.hero.code.data.local.dao.HeroDao;
import com.hero.code.data.local.dao.HeroDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HeroDatabase_Impl extends HeroDatabase {
  private volatile HeroDao _heroDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `hero` (`link_url` TEXT NOT NULL, `display_title` TEXT NOT NULL, `critics_pick` INTEGER NOT NULL, `byline` TEXT NOT NULL, `headline` TEXT NOT NULL, `summary_short` TEXT NOT NULL, `publication_date` INTEGER NOT NULL, `opening_date` INTEGER, `link_type` TEXT, `suggested_link_text` TEXT, `multimedia_type` TEXT, `multimedia_src` TEXT, `multimedia_width` REAL, `multimedia_height` REAL, `is_favorite` INTEGER NOT NULL, PRIMARY KEY(`link_url`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '529fd34a37bebe18e6381d63ec33f55a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `hero`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHero = new HashMap<String, TableInfo.Column>(15);
        _columnsHero.put("link_url", new TableInfo.Column("link_url", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("display_title", new TableInfo.Column("display_title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("critics_pick", new TableInfo.Column("critics_pick", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("byline", new TableInfo.Column("byline", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("headline", new TableInfo.Column("headline", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("summary_short", new TableInfo.Column("summary_short", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("publication_date", new TableInfo.Column("publication_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("opening_date", new TableInfo.Column("opening_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("link_type", new TableInfo.Column("link_type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("suggested_link_text", new TableInfo.Column("suggested_link_text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("multimedia_type", new TableInfo.Column("multimedia_type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("multimedia_src", new TableInfo.Column("multimedia_src", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("multimedia_width", new TableInfo.Column("multimedia_width", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("multimedia_height", new TableInfo.Column("multimedia_height", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHero.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHero = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHero = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHero = new TableInfo("hero", _columnsHero, _foreignKeysHero, _indicesHero);
        final TableInfo _existingHero = TableInfo.read(_db, "hero");
        if (! _infoHero.equals(_existingHero)) {
          return new RoomOpenHelper.ValidationResult(false, "hero(com.nyt.heroes.data.local.entity.DbHero).\n"
                  + " Expected:\n" + _infoHero + "\n"
                  + " Found:\n" + _existingHero);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "529fd34a37bebe18e6381d63ec33f55a", "a3b5b4a03f370820afc07320cc99d701");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "hero");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `hero`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public HeroDao heroDao() {
    if (_heroDao != null) {
      return _heroDao;
    } else {
      synchronized(this) {
        if(_heroDao == null) {
          _heroDao = new HeroDao_Impl(this);
        }
        return _heroDao;
      }
    }
  }
}
