package com.hero.code.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hero.code.data.local.entity.DbHero;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HeroDao_Impl implements HeroDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DbHero> __insertionAdapterOfDbHero;

  private final EntityDeletionOrUpdateAdapter<DbHero> __updateAdapterOfDbHero;

  public HeroDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDbHero = new EntityInsertionAdapter<DbHero>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `hero` (`link_url`,`display_title`,`critics_pick`,`byline`,`headline`,`summary_short`,`publication_date`,`opening_date`,`link_type`,`suggested_link_text`,`multimedia_type`,`multimedia_src`,`multimedia_width`,`multimedia_height`,`is_favorite`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbHero value) {
        if (value.getLinkUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLinkUrl());
        }
        if (value.getDisplayTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDisplayTitle());
        }
        stmt.bindLong(3, value.getCriticsPick());
        if (value.getByline() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getByline());
        }
        if (value.getHeadline() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHeadline());
        }
        if (value.getSummaryShort() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSummaryShort());
        }
        stmt.bindLong(7, value.getPublicationDate());
        if (value.getOpeningDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getOpeningDate());
        }
        if (value.getLinkType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLinkType());
        }
        if (value.getSuggestedLinkText() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getSuggestedLinkText());
        }
        if (value.getMultimediaType() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getMultimediaType());
        }
        if (value.getMultimediaSrc() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getMultimediaSrc());
        }
        if (value.getMultimediaWidth() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindDouble(13, value.getMultimediaWidth());
        }
        if (value.getMultimediaHeight() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getMultimediaHeight());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(15, _tmp);
      }
    };
    this.__updateAdapterOfDbHero = new EntityDeletionOrUpdateAdapter<DbHero>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `hero` SET `link_url` = ?,`display_title` = ?,`critics_pick` = ?,`byline` = ?,`headline` = ?,`summary_short` = ?,`publication_date` = ?,`opening_date` = ?,`link_type` = ?,`suggested_link_text` = ?,`multimedia_type` = ?,`multimedia_src` = ?,`multimedia_width` = ?,`multimedia_height` = ?,`is_favorite` = ? WHERE `link_url` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbHero value) {
        if (value.getLinkUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLinkUrl());
        }
        if (value.getDisplayTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDisplayTitle());
        }
        stmt.bindLong(3, value.getCriticsPick());
        if (value.getByline() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getByline());
        }
        if (value.getHeadline() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHeadline());
        }
        if (value.getSummaryShort() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSummaryShort());
        }
        stmt.bindLong(7, value.getPublicationDate());
        if (value.getOpeningDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getOpeningDate());
        }
        if (value.getLinkType() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLinkType());
        }
        if (value.getSuggestedLinkText() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getSuggestedLinkText());
        }
        if (value.getMultimediaType() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getMultimediaType());
        }
        if (value.getMultimediaSrc() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getMultimediaSrc());
        }
        if (value.getMultimediaWidth() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindDouble(13, value.getMultimediaWidth());
        }
        if (value.getMultimediaHeight() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getMultimediaHeight());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(15, _tmp);
        if (value.getLinkUrl() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getLinkUrl());
        }
      }
    };
  }

  @Override
  public Object insertHeroes(final List<DbHero> heroes, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDbHero.insert(heroes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateHero(final DbHero hero, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfDbHero.handle(hero);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getHeroes(final int limit, final String query,
      final Continuation<? super List<DbHero>> p2) {
    final String _sql = "SELECT * FROM hero WHERE display_title LIKE ? OR summary_short LIKE ? ORDER BY publication_date DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.execute(__db, false, new Callable<List<DbHero>>() {
      @Override
      public List<DbHero> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLinkUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "link_url");
          final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "display_title");
          final int _cursorIndexOfCriticsPick = CursorUtil.getColumnIndexOrThrow(_cursor, "critics_pick");
          final int _cursorIndexOfByline = CursorUtil.getColumnIndexOrThrow(_cursor, "byline");
          final int _cursorIndexOfHeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "headline");
          final int _cursorIndexOfSummaryShort = CursorUtil.getColumnIndexOrThrow(_cursor, "summary_short");
          final int _cursorIndexOfPublicationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publication_date");
          final int _cursorIndexOfOpeningDate = CursorUtil.getColumnIndexOrThrow(_cursor, "opening_date");
          final int _cursorIndexOfLinkType = CursorUtil.getColumnIndexOrThrow(_cursor, "link_type");
          final int _cursorIndexOfSuggestedLinkText = CursorUtil.getColumnIndexOrThrow(_cursor, "suggested_link_text");
          final int _cursorIndexOfMultimediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_type");
          final int _cursorIndexOfMultimediaSrc = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_src");
          final int _cursorIndexOfMultimediaWidth = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_width");
          final int _cursorIndexOfMultimediaHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_height");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<DbHero> _result = new ArrayList<DbHero>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DbHero _item;
            final String _tmpLinkUrl;
            _tmpLinkUrl = _cursor.getString(_cursorIndexOfLinkUrl);
            final String _tmpDisplayTitle;
            _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
            final int _tmpCriticsPick;
            _tmpCriticsPick = _cursor.getInt(_cursorIndexOfCriticsPick);
            final String _tmpByline;
            _tmpByline = _cursor.getString(_cursorIndexOfByline);
            final String _tmpHeadline;
            _tmpHeadline = _cursor.getString(_cursorIndexOfHeadline);
            final String _tmpSummaryShort;
            _tmpSummaryShort = _cursor.getString(_cursorIndexOfSummaryShort);
            final long _tmpPublicationDate;
            _tmpPublicationDate = _cursor.getLong(_cursorIndexOfPublicationDate);
            final Long _tmpOpeningDate;
            if (_cursor.isNull(_cursorIndexOfOpeningDate)) {
              _tmpOpeningDate = null;
            } else {
              _tmpOpeningDate = _cursor.getLong(_cursorIndexOfOpeningDate);
            }
            final String _tmpLinkType;
            _tmpLinkType = _cursor.getString(_cursorIndexOfLinkType);
            final String _tmpSuggestedLinkText;
            _tmpSuggestedLinkText = _cursor.getString(_cursorIndexOfSuggestedLinkText);
            final String _tmpMultimediaType;
            _tmpMultimediaType = _cursor.getString(_cursorIndexOfMultimediaType);
            final String _tmpMultimediaSrc;
            _tmpMultimediaSrc = _cursor.getString(_cursorIndexOfMultimediaSrc);
            final Double _tmpMultimediaWidth;
            if (_cursor.isNull(_cursorIndexOfMultimediaWidth)) {
              _tmpMultimediaWidth = null;
            } else {
              _tmpMultimediaWidth = _cursor.getDouble(_cursorIndexOfMultimediaWidth);
            }
            final Double _tmpMultimediaHeight;
            if (_cursor.isNull(_cursorIndexOfMultimediaHeight)) {
              _tmpMultimediaHeight = null;
            } else {
              _tmpMultimediaHeight = _cursor.getDouble(_cursorIndexOfMultimediaHeight);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new DbHero(_tmpLinkUrl,_tmpDisplayTitle,_tmpCriticsPick,_tmpByline,_tmpHeadline,_tmpSummaryShort,_tmpPublicationDate,_tmpOpeningDate,_tmpLinkType,_tmpSuggestedLinkText,_tmpMultimediaType,_tmpMultimediaSrc,_tmpMultimediaWidth,_tmpMultimediaHeight,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public Object getFavoriteHeroes(final int limit, final Continuation<? super List<DbHero>> p1) {
    final String _sql = "SELECT * FROM hero WHERE is_favorite = 1 ORDER BY publication_date DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.execute(__db, false, new Callable<List<DbHero>>() {
      @Override
      public List<DbHero> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLinkUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "link_url");
          final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "display_title");
          final int _cursorIndexOfCriticsPick = CursorUtil.getColumnIndexOrThrow(_cursor, "critics_pick");
          final int _cursorIndexOfByline = CursorUtil.getColumnIndexOrThrow(_cursor, "byline");
          final int _cursorIndexOfHeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "headline");
          final int _cursorIndexOfSummaryShort = CursorUtil.getColumnIndexOrThrow(_cursor, "summary_short");
          final int _cursorIndexOfPublicationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publication_date");
          final int _cursorIndexOfOpeningDate = CursorUtil.getColumnIndexOrThrow(_cursor, "opening_date");
          final int _cursorIndexOfLinkType = CursorUtil.getColumnIndexOrThrow(_cursor, "link_type");
          final int _cursorIndexOfSuggestedLinkText = CursorUtil.getColumnIndexOrThrow(_cursor, "suggested_link_text");
          final int _cursorIndexOfMultimediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_type");
          final int _cursorIndexOfMultimediaSrc = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_src");
          final int _cursorIndexOfMultimediaWidth = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_width");
          final int _cursorIndexOfMultimediaHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "multimedia_height");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<DbHero> _result = new ArrayList<DbHero>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DbHero _item;
            final String _tmpLinkUrl;
            _tmpLinkUrl = _cursor.getString(_cursorIndexOfLinkUrl);
            final String _tmpDisplayTitle;
            _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
            final int _tmpCriticsPick;
            _tmpCriticsPick = _cursor.getInt(_cursorIndexOfCriticsPick);
            final String _tmpByline;
            _tmpByline = _cursor.getString(_cursorIndexOfByline);
            final String _tmpHeadline;
            _tmpHeadline = _cursor.getString(_cursorIndexOfHeadline);
            final String _tmpSummaryShort;
            _tmpSummaryShort = _cursor.getString(_cursorIndexOfSummaryShort);
            final long _tmpPublicationDate;
            _tmpPublicationDate = _cursor.getLong(_cursorIndexOfPublicationDate);
            final Long _tmpOpeningDate;
            if (_cursor.isNull(_cursorIndexOfOpeningDate)) {
              _tmpOpeningDate = null;
            } else {
              _tmpOpeningDate = _cursor.getLong(_cursorIndexOfOpeningDate);
            }
            final String _tmpLinkType;
            _tmpLinkType = _cursor.getString(_cursorIndexOfLinkType);
            final String _tmpSuggestedLinkText;
            _tmpSuggestedLinkText = _cursor.getString(_cursorIndexOfSuggestedLinkText);
            final String _tmpMultimediaType;
            _tmpMultimediaType = _cursor.getString(_cursorIndexOfMultimediaType);
            final String _tmpMultimediaSrc;
            _tmpMultimediaSrc = _cursor.getString(_cursorIndexOfMultimediaSrc);
            final Double _tmpMultimediaWidth;
            if (_cursor.isNull(_cursorIndexOfMultimediaWidth)) {
              _tmpMultimediaWidth = null;
            } else {
              _tmpMultimediaWidth = _cursor.getDouble(_cursorIndexOfMultimediaWidth);
            }
            final Double _tmpMultimediaHeight;
            if (_cursor.isNull(_cursorIndexOfMultimediaHeight)) {
              _tmpMultimediaHeight = null;
            } else {
              _tmpMultimediaHeight = _cursor.getDouble(_cursorIndexOfMultimediaHeight);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new DbHero(_tmpLinkUrl,_tmpDisplayTitle,_tmpCriticsPick,_tmpByline,_tmpHeadline,_tmpSummaryShort,_tmpPublicationDate,_tmpOpeningDate,_tmpLinkType,_tmpSuggestedLinkText,_tmpMultimediaType,_tmpMultimediaSrc,_tmpMultimediaWidth,_tmpMultimediaHeight,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getFavoriteHeroesCount(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT COUNT(*) FROM hero WHERE is_favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getHeroesCount(final String query, final Continuation<? super Integer> p1) {
    final String _sql = "SELECT COUNT(*) FROM hero WHERE display_title LIKE ? OR summary_short LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
