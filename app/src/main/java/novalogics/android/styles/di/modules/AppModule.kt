package novalogics.android.styles.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import novalogics.android.styles.data.repository.local.LocalDataRepository
import novalogics.android.styles.data.repository.local.LocalDataRepositoryImpl
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideApplicationContext(
        @ApplicationContext context: Context
    ): Context = context

    @Provides
    @Singleton
    fun provideRepository(
        @ApplicationContext context: Context
    ): LocalDataRepository {
        return LocalDataRepositoryImpl(context)
    }
}
